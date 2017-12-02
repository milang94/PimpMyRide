var services = angular.module('services', [ 'ngResource' ]);

var baseUrl = 'http://localhost\\:8080';

services.service('service', [
		'$http',
		function($http) {

			this.allBrands = function() {
				return $http.get("/controller/getAllBrands");
			}

			this.findModels = function(brandName) {
				return $http.get("/controller/getAllModels/" + brandName);
			}

			this.findBuildYears = function(modelName, brandName) {
				return $http.get("/controller/getAllBuildYears/" + brandName
						+ "/" + modelName);
			}

		} ]);