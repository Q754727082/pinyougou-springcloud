app.controller('baseController',function ($scope) {
    //分页控件配置
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function(){
            //$scope.reloadList();//重新加载
            $scope.findPage();
        }
    };
    //页面的主元素单个
    $scope.entity={};
    //页面的主元素的数组
    $scope.entities=[];
    $scope.deltemp=[]
    $scope.addToTemp=function(event,id){
        if(event.target.checked) {
            $scope.deltemp.push(id)
        }else {
            index=$scope.deltemp.indexOf(id)
            $scope.deltemp.splice(index,1);
        }
    }
})