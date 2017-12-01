'use strict';

angular.module('routerApp', [ 'ui.router', 'services', 'controllers' ]).config(
		function($stateProvider, $urlRouterProvider) {

			$urlRouterProvider.otherwise('/home');

			$stateProvider

			.state('home', {
				url : '/home',
				templateUrl : 'pages/home.html',
				controller : 'controller'
			})

		});