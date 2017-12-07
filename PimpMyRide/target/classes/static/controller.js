var app = angular.module('controllers', [ 'ngSanitize' ]);

app
		.controller(
				'controller',
				[
						'$scope',
						'$rootScope',
						'service',
						'$location',
						'$window',
						function($scope, $rootScope, service, $location,
								$window) {

							$scope.allBrands = function() {
								service.allBrands().then(function(response) {
									$rootScope.brands = response.data;
								});
							}

							$scope.findModels = function(brandName) {
								service.findModels(brandName).then(
										function(response) {
											$rootScope.models = response.data;
											$rootScope.brand = brandName;
											$window.localStorage.setItem(
													'brand', brandName);
											$rootScope.refresh = false;
											$rootScope.myText = "<h3>"
													+ brandName + "</h3>";
											$location.path('/navBar/models');
										});
							}

							function findModels2(brandName) {
								if ($rootScope.refresh == undefined
										|| $rootScope.refresh == true) {
									service
											.findModels(brandName)
											.then(
													function(response) {
														$rootScope.models = response.data;
														$rootScope.brand = brandName;
														$window.localStorage
																.setItem(
																		'brand',
																		brandName);
														$rootScope.myText = "<h3>"
																+ brandName
																+ "</h3>";
														$rootScope.refresh = true;
													});
								}
							}

							$scope.findBuildYears = function(modelName) {
								service
										.findBuildYears(modelName,
												$rootScope.brand)
										.then(
												function(response) {
													$rootScope.buildYears = response.data;
													$rootScope.model = modelName;
													$window.localStorage
															.setItem('model',
																	modelName);
													$rootScope.myText = "<h3>"
															+ $rootScope.brand
															+ "</h3><h4>"
															+ modelName
															+ "</h4>";
													$rootScope.refresh2 = false;
													$location
															.path('/navBar/models/buildYears');
												});
							}

							function findBuildYears2(modelName) {
								if ($rootScope.refresh2 == undefined
										|| $rootScope.refresh2 == true) {
									service
											.findBuildYears(modelName,
													$rootScope.brand)
											.then(
													function(response) {
														$rootScope.buildYears = response.data;
														$rootScope.model = modelName;
														$window.localStorage
																.setItem(
																		'model',
																		modelName);
														$rootScope.myText = "<h3>"
																+ $rootScope.brand
																+ "</h3><h4>"
																+ modelName
																+ "</h4>";
														$rootScope.refresh2 = true;
													});
								}
							}

							$scope.findMotorType = function(year) {
								service
										.findMotorType(year, $rootScope.model,
												$rootScope.brand)
										.then(
												function(response) {
													$rootScope.motorTypes1 = [];
													$rootScope.motorTypes2 = [];
													for (var i = 0; i < response.data.length; i += 1) {
														if (response.data[i][1] == "Benzin") {
															$rootScope.motorTypes1
																	.push(response.data[i]);
														} else {
															$rootScope.motorTypes2
																	.push(response.data[i])
														}
													}
													$rootScope.yearr = year;
													$window.localStorage
															.setItem('year',
																	year);
													$rootScope.myText = "<h3>"
															+ $rootScope.brand
															+ "</h3><h4>"
															+ $rootScope.model
															+ "</h4><h5>"
															+ year + "</h5>";
													$rootScope.refresh3 = false;
													$location
															.path('/navBar/models/buildYears/motorTypes');
												});
							}

							function findMotorTypes2(year) {
								if ($rootScope.refresh3 == undefined
										|| $rootScope.refresh3 == true) {
									service
											.findMotorType(year,
													$rootScope.model,
													$rootScope.brand)
											.then(
													function(response) {
														$rootScope.motorTypes1 = [];
														$rootScope.motorTypes2 = [];
														for (var i = 0; i < response.data.length; i += 1) {
															if (response.data[i][1] == "Benzin") {
																$rootScope.motorTypes1
																		.push(response.data[i]);
															} else {
																$rootScope.motorTypes2
																		.push(response.data[i])
															}
														}
														$rootScope.yearr = year;
														$window.localStorage
																.setItem(
																		'year',
																		year);
														$rootScope.myText = "<h3>"
																+ $rootScope.brand
																+ "</h3><h4>"
																+ $rootScope.model
																+ "</h4><h5>"
																+ year
																+ "</h5>";
														$rootScope.refresh3 = true;
													});
								}
							}

							$scope.allInformations = function(mt) {
								service
										.allInformations($rootScope.brand,
												$rootScope.model,
												$rootScope.yearr, mt[0], mt[1],
												mt[2])
										.then(
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
													$location
															.path('navBar/allInformations/stage1');
												});
							}

							$scope.info = function() {
								$rootScope.brand = $window.localStorage
										.getItem('brand');
								$rootScope.model = $window.localStorage
										.getItem('model');
								$rootScope.yearr = $window.localStorage
										.getItem('year');
								findModels2($rootScope.brand);
								findBuildYears2($rootScope.model);
								findMotorTypes2($rootScope.yearr);
							}

							$scope.info2 = function() {
								$rootScope.brand = $window.localStorage
										.getItem('brand');
								$rootScope.model = $window.localStorage
										.getItem('model');
								findModels2($rootScope.brand);
								findBuildYears2($rootScope.model);
							}

							$scope.info3 = function() {
								$rootScope.brand = $window.localStorage
										.getItem('brand');
								findModels2($rootScope.brand);
							}

							function infoo() {

							}

						} ]);