<template>
  <div>
    <el-menu default-active="1-1" class="el-menu-vertical-demo">
      <el-submenu index="1">
        <template slot="title">
          <span>首页</span>
        </template>
        <el-menu-item-group>
          <span slot="title" style>
            <i class="el-icon-s-data"></i>统计
          </span>
          <el-menu-item index="1-1">用户分析</el-menu-item>
          <el-menu-item index="1-2">订单分析</el-menu-item>
        </el-menu-item-group>

        <el-menu-item-group>
          <span slot="title">
            <i class="el-icon-folder"></i>管理
          </span>
          <el-menu-item index="2-1" @click="handleUser">用户管理</el-menu-item>
          <el-menu-item index="2-2" @click="handleCard">卡卷管理</el-menu-item>
          <el-menu-item index="2-3" @click="handleGood">商品管理</el-menu-item>
          <el-menu-item index="2-4" @click="handleOrder">订单管理</el-menu-item>
        </el-menu-item-group>

        <el-menu-item-group>
          <span slot="title">
            <i class="el-icon-suitcase"></i>开发
          </span>
          <el-menu-item index="3-1">基本设置</el-menu-item>
          <el-menu-item index="3-2">接入权限</el-menu-item>
        </el-menu-item-group>

        <el-menu-item-group>
          <span slot="title">
            <i class="el-icon-setting"></i>设置
          </span>
          <el-menu-item index="4-1">平台信息</el-menu-item>
          <el-menu-item index="4-2">账户权限</el-menu-item>
        </el-menu-item-group>
      </el-submenu>

      <el-menu-item index="2">
        <span slot="title">联系客服</span>
      </el-menu-item>
      <el-menu-item index="3" >
        <span slot="title">关于</span>
      </el-menu-item>
      <!-- <el-menu-item index="4">
        <i class="el-icon-setting"></i>
        <span slot="title">导航四</span>
      </el-menu-item>-->
    </el-menu>
  </div>
</template>
<script>
export default {
  data() {
    return {};
  },
  methods: {
    handleOpen(key, keyPath) {    //打开操作
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {   //关闭操作
      console.log(key, keyPath);
    },
    handleUser(){                 //点击用户管理
      this.$router.push("/layout/usersm")
    },
    handleOrder(){                //点击订单管理
      this.$router.push("/layout/ordersm")
    },
    handleCard(){                 //点击卡卷管理
      this.$router.push("/layout/usersm")
    },
    handleGood(){                //点击商品管理
      this.$router.push("/layout/ordersm")
    }
  }
};
</script>

<style scoped>
/* .el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 200px;
  min-height: 400px;
} */
i {
  margin-left: -100px;
}
</style>