<template>
  <div>
    <el-menu
      default-active="1-1"
      class="el-menu-vertical-demo"
    >
      <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span slot="title">统计</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="1-1">用户分析</el-menu-item>
          <el-menu-item index="1-2">订单分析</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="2">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span slot="title">管理</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="2-1">用户管理</el-menu-item>
          <el-menu-item index="2-2">卡卷管理</el-menu-item>
          <el-menu-item index="2-3">商品管理</el-menu-item>
          <el-menu-item index="2-4">订单管理</el-menu-item>
          <!-- <el-menu-item index="2-5">用户分析</el-menu-item>
          <el-menu-item index="2-6">订单分析</el-menu-item>
          <el-menu-item index="2-7">用户分析</el-menu-item>
          <el-menu-item index="2-8">订单分析</el-menu-item> -->
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span slot="title">开发</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="3-1">基本设置</el-menu-item>
          <el-menu-item index="3-2">接入权限</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="4">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span slot="title">设置</span>
        </template>
        <el-menu-item-group>
          <el-menu-item index="4-1">平台信息</el-menu-item>
          <el-menu-item index="4-2">账户权限</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
  </div>
</template>
<script>
export default {
  data() {
    return {
      
    };
  },
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    }
  }
};
</script>

<style scoped>
/* .el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 200px;
  min-height: 400px;
} */
</style>