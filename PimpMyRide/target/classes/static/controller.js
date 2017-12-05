var app = angular.module('controllers', [ 'ngSanitize' ]);

app.controller('controller', [
		'$scope',
		'$rootScope',
		'service',
		'$location',
		function($scope, $rootScope, service, $location) {

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
							$rootScope.myText = "<h4>" + modelName + "</h4>";
							$location.path('/models/buildYears');
						});
			}

			$scope.findMotorType = function(year) {
				service.findMotorType(year, $rootScope.model, $rootScope.brand)
						.then(function(response) {
							$rootScope.motorTypes1 = [];
							$rootScope.motorTypes2 = [];
							for(var i = 0 ; i<response.data.length; i+=1){
								if(response.data[i][1] == "Benzin"){
									$rootScope.motorTypes1.push(response.data[i]);
								} else {
									$rootScope.motorTypes2.push(response.data[i])
								}
							}
							$rootScope.yearr = year;
							$location.path('/models/buildYears/motorTypes');
						});
			}

		} ]);