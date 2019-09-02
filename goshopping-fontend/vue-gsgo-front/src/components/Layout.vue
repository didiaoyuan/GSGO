<template>
  <el-container>
    <el-header>Header</el-header>
    <el-container>
      <el-aside width="200px" style="background-color:rgb(238,241,246)">
          <Aside/>
      </el-aside>
      <el-container>
        <el-main>Main</el-main>
        <el-footer>Footer</el-footer>
      </el-container>
    </el-container>
  </el-container>
</template>


<script>
// 导入侧边栏组件
import Aside from '@/views/layout/Aside.vue'
export default {
    name:"layout",
    components:{
        Aside
    }
};
</script>

<style scoped>
</style>