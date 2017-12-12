var app = angular.module('controllers', [ 'ngSanitize' ]);

app
		.controller(
				'controller',
				[
						'$scope',
						'$rootScope',
						'service',
						'$location','$window',
						function($scope, $rootScope, service, $location,$window) {

							$scope.returnToBrands = function() {
								$rootScope.myText = null;
								$rootScope.varvar = false;
								$location.path('/home/brands');
							}

							$scope.findModels = function(brandName) {
								service.findModels(brandName).then(
										function(response) {
											$rootScope.models = response.data;
											$rootScope.brand = brandName;
											$window.localStorage.setItem('brandd',brandName);
											$rootScope.myText = "<h3>"
													+ brandName + "</h3>";
											$rootScope.myText1 = "Modell"
											$location.path('/home/models');
										});
							}

							$scope.findBuildYears = function(modelName) {
								service
										.findBuildYears(modelName,
												$rootScope.brand)
										.then(
												function(response) {
													$rootScope.varvar = true;
													$rootScope.buildYears = response.data;
													$rootScope.model = modelName;
													$window.localStorage.setItem('modell',modelName);
													$rootScope.myText = "<h3>"
															+ $rootScope.brand
															+ "</h3><h4>"
															+ modelName
															+ "</h4>";
													$rootScope.myText1 = "Modell";
													$location
															.path('/home/models/buildYears');
												});
							}

							$scope.findMotorType = function(year) {
								service
										.findMotorType(year, $rootScope.model,
												$rootScope.brand)
										.then(
												function(response) {
													$rootScope.motorTypes1 = [];
													$rootScope.motorTypes2 = [];
													$rootScope.motorTypes3 = [];
													for (var i = 0; i < response.data.length; i += 1) {
														if (response.data[i][1] == "Benzin") {
															$rootScope.motorTypes1.push(response.data[i]);
														} else if(response.data[i][1] == "Diesel"){
															$rootScope.motorTypes2.push(response.data[i])
														} else{
															$rootScope.motorTypes3.push(response.data[i])
														}
													}
													$rootScope.yearr = year;
													$window.localStorage.setItem('yearrr',year);
													$rootScope.myText1 = "Motortyp";
													$rootScope.myText = "<h3>"
															+ $rootScope.brand
															+ "</h3><h4>"
															+ $rootScope.model
															+ "</h4><h5>"
															+ year + "</h5>";
													$location.path('/home/models/buildYears/motorTypes');
												});
							}

							$scope.allInformations = function(mt) {
								service.allInformations($rootScope.brand,$rootScope.model,$rootScope.yearr, mt[0], mt[1],mt[2]).then(
												function(response) {
													$rootScope.car = response.data;													
													$rootScope.myText = "<h3>"
															+ $rootScope.brand
															+ "</h3><h4>"
															+ $rootScope.model
															+ "</h4><h5>"
															+ $rootScope.yearr
															+ "</h5><h6>" + mt
															+ "</h6>";
													$window.localStorage.setItem('mt0',mt[0]);
													$window.localStorage.setItem('mt1',mt[1]);
													$window.localStorage.setItem('mt2',mt[2]);
													$location
															.path('home/allInformations/stage1');
												});
							}

							$scope.refresh = function() {
								if ($rootScope.brand == undefined) {
									$rootScope.varvar = false;
									$rootScope.myText = null;
									$location.path('/home/brand');
								}
							}

							$scope.findBrand = function(brandName) {
								service.findBrand(brandName).then(
										function(response) {
											$rootScope.brandModel = response.data;
												});
							}
							
							$scope.ref = function(){
								if($rootScope.car == undefined){	
									var b = $window.localStorage.getItem('brandd');
									var m = $window.localStorage.getItem('modell');
									var y = $window.localStorage.getItem('yearrr');
									var m0 = $window.localStorage.getItem('mt0');
									var m1 = $window.localStorage.getItem('mt1');
									var m2 = $window.localStorage.getItem('mt2');
									$rootScope.varvar = true;
									service.allInformations(b, m, y, m0, m1, m2).then(
											function(response) {
												$rootScope.car = response.data;													
												$rootScope.myText = "<h3>"
														+ b
														+ "</h3><h4>"
														+ m
														+ "</h4><h5>"
														+ y
														+ "</h5><h6>" + m0 +" "+ m1 + " " + m2
														+ "</h6>";
											});									
								}
							}

						} ]);