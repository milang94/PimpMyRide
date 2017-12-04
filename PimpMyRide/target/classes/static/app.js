'use strict';

angular.module('routerApp', [ 'ui.router', 'services', 'controllers' ]).config(
		function($stateProvider, $urlRouterProvider) {

			$urlRouterProvider.otherwise('/home');

			$stateProvider

			.state('home', {
				url : '/home',
				templateUrl : 'pages/home.html',
				controller : 'controller'
			}).state('models', {
				url : '/models',
				templateUrl : 'pages/models.html',
				controller : 'controller'
			}).state('models.buildYears', {
				url : '/buildYears',
				templateUrl : 'pages/buildYears.html',
				controller : 'controller'
			}).state('models.buildYears.motorTypes', {
				url : '/motorTypes',
				templateUrl : 'pages/motorTypes.html',
				controller : 'controller'
			})
			

		});