'use strict';

angular.module('routerApp', [ 'ui.router', 'services', 'controllers' ]).config(
		function($stateProvider, $urlRouterProvider) {

			$urlRouterProvider.otherwise('/navBar/home');

			$stateProvider

			.state('navBar', {
				url : '/navBar',
				templateUrl : 'pages/navBar.html',
				controller : 'controller'
			}).state('navBar.home', {
				url : '/home',
				templateUrl : 'pages/home.html',
				controller : 'controller'
			}).state('navBar.models', {
				url : '/models',
				templateUrl : 'pages/models.html',
				controller : 'controller'
			}).state('navBar.models.buildYears', {
				url : '/buildYears',
				templateUrl : 'pages/buildYears.html',
				controller : 'controller'
			}).state('navBar.models.buildYears.motorTypes', {
				url : '/motorTypes',
				templateUrl : 'pages/motorTypes.html',
				controller : 'controller'
			}).state('navBar.allInformations', {
				url : '/allInformations',
				templateUrl : 'pages/allInformations.html',
				controller : 'controller'
			}).state('navBar.allInformations.stage1', {
				url : '/stage1',
				views : {
					'tableData' : {
						templateUrl : 'pages/stageTable1.html'
					},
					'graph' : {
						templateUrl : 'pages/stageGraph1.html'
					}
				}
			}).state('navBar.allInformations.stage2', {
				url : '/stage2',
				views : {
					'tableData' : {
						templateUrl : 'pages/stageTable2.html'
					},
					'graph' : {
						templateUrl : 'pages/stageTable2.html'
					}
				}
			})

		});