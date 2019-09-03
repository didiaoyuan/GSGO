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
    <div class="header_logout">
      <i class="el-icon-delete">退出</i>
    </div>
  </div>
</template>
<script>
export default {};
</script>
<style scoped>
.header_bg {
  background: #F8F8F8;
  display: flex;
  align-items: center;
}

.header_logo {
  width: 200px;
  height: 40px;
  margin-left: 20px;
  background-color: pink;
  display: flex;
  flex-direction: column;
  align-content: flex-end;
}
.header_title {
  margin-left: 20px;
  font-weight: bold;
  color: #F55D54;
}
.header_avatar {
  display: flex;
  flex-grow: 1;
  justify-content: flex-end;
  align-items: center
}
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
