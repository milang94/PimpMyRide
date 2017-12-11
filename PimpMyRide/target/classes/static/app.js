'use strict';

angular.module('routerApp', [ 'ui.router', 'services', 'controllers' ]).config(
		function($stateProvider, $urlRouterProvider) {

			$urlRouterProvider.otherwise('/home/brand');

			$stateProvider

			.state('home', {
				url : '/home',
				templateUrl : 'pages/home.html',
				controller : 'controller'
			}).state('home.brand', {
				url : '/brand',
				templateUrl : 'pages/brand.html',
				controller : 'controller'
			}).state('home.models', {
				url : '/models',
				templateUrl : 'pages/models.html',
				controller : 'controller'
			}).state('home.models.buildYears', {
				url : '/buildYears',
				templateUrl : 'pages/buildYears.html',
				controller : 'controller'
			}).state('home.models.buildYears.motorTypes', {
				url : '/motorTypes',
				templateUrl : 'pages/motorTypes.html',
				controller : 'controller'
			}).state('home.allInformations', {
				url : '/allInformations',
				templateUrl : 'pages/allInformations.html',
				controller : 'controller'
			}).state('home.allInformations.stage1', {
				url : '/stage1',
				views : {
					'tableData' : {
						templateUrl : 'pages/stageTable1.html'
					},
					'graph' : {
						templateUrl : 'pages/stageGraph1.html'
					}
				}
			}).state('home.allInformations.stage2', {
				url : '/stage2',
				views : {
					'tableData' : {
						templateUrl : 'pages/stageTable2.html'
					},
					'graph' : {
						templateUrl : 'pages/stageGraph2.html'
					}
				}
			}).state('home.allInformations.stage3', {
				url : '/stage3',
				views : {
					'tableData' : {
						templateUrl : 'pages/stageTable3.html'
					},
					'graph' : {
						templateUrl : 'pages/stageGraph3.html'
					}
				}
			}).state('home.allInformations.stage4', {
				url : '/stage4',
				views : {
					'tableData' : {
						templateUrl : 'pages/stageTable4.html'
					},
					'graph' : {
						templateUrl : 'pages/stageGraph4.html'
					}
				}
			}).state('home.allInformations.dsg6', {
				url : '/dsg6',
				views : {
					'tableData' : {
						templateUrl : 'pages/dsg6Table.html'
					},
					'graph' : {
						templateUrl : 'pages/dsg6Video.html'
					}
				}
			}).state('home.allInformations.eco', {
				url : '/eco',
				views : {
					'tableData' : {
						templateUrl : 'pages/ecoTable.html'
					},
					'graph' : {
						templateUrl : 'pages/ecoDescription.html'
					}
				}
			})

		});