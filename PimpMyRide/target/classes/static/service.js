var services = angular.module('services', [ 'ngResource', 'ngSanitize' ]);

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
			
			this.findBrand = function(brandName) {
				return $http.get("/controller/getBrand/" + brandName);
			}

			this.findBuildYears = function(modelName, brandName) {
				return $http.get("/controller/getAllBuildYears/" + brandName
						+ "/" + modelName);
			}

			this.findMotorType = function(year, modelName, brandName) {
				return $http.get("/controller/getMotorTypes/" + brandName + "/"
						+ year + "/" + modelName);
			}

			this.allInformations = function(brand, model, year, motortype,
					fuel, opower) {
				return $http.get("/controller/getAllInformations/" + brand
						+ "/" + model + "/" + year + "/" + motortype + "/"
						+ fuel + "/" + opower);
			}

		} ]);