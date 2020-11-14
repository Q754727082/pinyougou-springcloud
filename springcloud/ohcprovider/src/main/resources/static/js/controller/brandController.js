app.controller('brandController',function ($scope,$controller,brandService) {
    $controller('baseController',{$scope:$scope}); //继承
    $scope.findAll=function () {
        brandService.findAll().success(function (data) {
            //alert(data);
            $scope.entities=data;
        })
    }
    $scope.findPage=function () {
        brandService.findPage($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage).success(function (data) {
            $scope.paginationConf.totalItems=data.total;
            $scope.entities=data.rows;
        })
    }
    $scope.save=function () {
        brandService.save($scope.entity).success(function (data) {
            if(data.success) {
                $scope.findPage();
                $scope.entity={};
            }
            else
                alert(data.message);
        })
    }
    $scope.findOne=function (id) {
        brandService.findOne(id).success(function (data) {
            if($scope.entity!=null&&$scope.entity.id!=-1)
                $scope.entity=data;
        })
    }
    $scope.deleteOne=function (id) {
        brandService.deleteOne(id).success(function (data) {
            if(data.success)
                $scope.findPage();
            else
                alert(data.message);
        })
    }
    $scope.deleteMany=function () {
        brandService.deleteMany($scope.deltemp).success(function (data) {
            if(data.success) {
                $scope.deltemp = [];
                $scope.findPage();
            }
            else
                alert(data.message);
        })

    }
})