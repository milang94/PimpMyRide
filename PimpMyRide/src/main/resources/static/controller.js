var app = angular.module('controllers', [ 'ngSanitize' ]);

app
		.controller(
				'controller',
				[
						'$scope',
						'$rootScope',
						'service',
						'$location',
						function($scope, $rootScope, service, $location) {

							$scope.allBrands = function() {
								service.allBrands().then(function(response) {
									$rootScope.brands = response.data;
									$location.path('/home/brand');
								});
							}
							
							$scope.findModels = function(brandName) {
								service.findModels(brandName).then(
										function(response) {
											$rootScope.models = response.data;
											$rootScope.brand = brandName;
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
													$rootScope.buildYears = response.data;
													$rootScope.model = modelName;
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
													$rootScope.myText1 = "Motortyp";
													$rootScope.myText = "<h3>"
															+ $rootScope.brand
															+ "</h3><h4>"
															+ $rootScope.model
															+ "</h4><h5>"
															+ year + "</h5>";
													$rootScope.refresh3 = false;
													$location
															.path('/home/models/buildYears/motorTypes');
												});
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
															.path('home/allInformations/stage1');
												});
							}

							$scope.refresh = function() {
								if ($rootScope.brand == undefined) {
									service
											.allBrands()
											.then(
													function(response) {
														$rootScope.brands = response.data;
														$location
																.path('/home/brand');
													});
								}
							}

						} ]);