<template>
  <div class="header_bg grid-content">
    <div class="header_logo">
      <img src alt />
    </div>
    <div class="header_title">GSGO后台管理平台</div>
    <div class="header_avatar">
      <el-avatar icon="el-icon-user-solid"></el-avatar>
      <div class="header_username">树先生</div>
    </div>
    <div class="header_logout" @click="handleout">
      <i class="el-icon-delete">注销</i>
    </div>
  </div>
</template>
<script>
export default {
  data(){
    return{

    }
  },
  methods:{
    handleout(){
        // 清楚缓存并跳转登录
        this.$confirm('此操作将注销账号, 是否继续?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.$router.push("/login");
          this.$message({
            type: 'success',
            message: '注销成功!'
          });
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消注销'
          });          
        });
        
    }
  }
};
</script>
<style scoped>
.header_bg {
  background: #F8F8F8;
  display: flex;
  align-items: center;
}
/* 
login 
 */
.header_logo {
  width: 200px;
  height: 40px;
  margin-left: 20px;
  background-color: pink;
  display: flex;
  flex-direction: column;
  align-content: flex-end;
}
/* 
标题
 */
.header_title {
  margin-left: 20px;
  font-weight: bold;
  color: #F55D54;
}

/* 
头像
 */
.header_avatar {
  display: flex;
  flex-grow: 1;
  justify-content: flex-end;
  align-items: center
}
/* 
用户名称
 */
.header_username{
  margin-left: 15px;
}
.grid-content {
  border-radius: 4px;
  min-height: 60px;
}
.header_logout {
  margin:0 20px;
  display: flex;
  color:#F55D54;
}
.header_logout i{
  color:#F55D54;
}
</style>
