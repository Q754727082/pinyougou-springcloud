app.service('brandService',function ($http) {
    this.findAll=function () {
        return $http.get('../brand/findAll');
    }
    this.findPage=function (pageNo, pageSize) {
        return $http.get('../brand/findPage?pageNo='+pageNo+'&pageSize='+pageSize);
    }
    this.save=function (entity) {
        return $http.post('../brand/save',entity);
    }
    this.findOne=function (id) {
        return $http.get('../brand/findOne?id='+id);
    }
    this.deleteOne=function (id) {
        return $http.get('../brand/deleteOne?id='+id);
    }
    this.deleteMany=function (ids) {
        return $http.get('../brand/deleteMany?ids='+ids);
    }
})