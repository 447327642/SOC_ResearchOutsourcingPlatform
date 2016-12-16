/*global define */
define([], function() {
	'use strict';
	function loginController($scope, $http, $location, $rootScope){
		$scope.loginTitle = "Login";
		$scope.user = {
        			userName: '',
        			password:''
        		};
        $scope.role = '';

        $scope.loginResult = "Please use your username and password to login";
        // Login Function
		$scope.login = function() {
            $http({
                method : 'POST',
                url : '/users/login',
                data : $scope.user
            }).success(function(data, status, headers, config) {
                $scope.loginResult = data;
                $rootScope.user.userName = $scope.user.userName;
                $rootScope.user.role = $scope.role;
                $location.path('/dashboard');
                }

            ).error(function (data, status, headers, config) {
                alert(data);
                console.log(data);
            });
        }
	}
	loginController.$inject=['$scope', '$http', '$location', '$rootScope'];

	return loginController;
});