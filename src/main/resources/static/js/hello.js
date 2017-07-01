var app = angular.module('hello',[]);

app.controller('HelloCtrn', function($scope) {
	$scope.todos = [
		{
			id : 1,
			title : 'game',
			completed : false,
			createdAt : Date.now()
		},
		{
			id : 2,
			title : 'study',
			completed : false,
			createdAt : Date.now()
		},
		{
			id : 3,
			title : 'cook',
			completed : false,
			createdAt : Date.now()
		},
	];

	$scope.remove = function(todo) {
		var idx = $scope.todos.findIndex(function(item) {
			return item.id == todo.id;
		});
		if(idx > -1) {
			$scope.todos.splice(idx, 1);
		}
	}
});
