var app = angular.module('controllers', []);

app.controller('controller', [
		'$scope',
		'$rootScope',
		'service',
		'$location',
		function($scope,$rootScope, service, $location) {

			$scope.allBrands = function() {
				service.allBrands().then(function(response) {
					$rootScope.brands = response.data;
				});
			}

			$scope.findModels = function(brandName) {
				service.findModels(brandName).then(function(response) {
					$rootScope.models = response.data;
					$rootScope.brand = brandName;
					$location.path('/models');
				});
			}

			$scope.findBuildYears = function(modelName) {
				service.findBuildYears(modelName, $rootScope.brand).then(
						function(response) {
							$rootScope.buildYears = response.data;
							$rootScope.model = modelName;
							$location.path('/models/buildYears');
						});
			}
			
			$scope.findMotorType = function(year) {
				service.findMotorType(year, $rootScope.model,$rootScope.brand).then(
						function(response) {
							$rootScope.motorTypes = response.data;
							$rootScope.yearr = year;
							$location.path('/models/buildYears/motorTypes');
						});
			}

		} ]);