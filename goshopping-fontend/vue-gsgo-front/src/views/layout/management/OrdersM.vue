<template>
    <el-container>
    <el-header>
      <el-tabs type="border-card">
        <el-tab-pane label="订单管理">
          <el-page-header @back="goBack" content="订单管理"></el-page-header>
          <el-main>
            <el-table
              :data="tableData.filter(data => !search || data.name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%"
            >
              <el-table-column label="用户头像" prop="avatar"></el-table-column>

              <el-table-column label="昵称" prop="name"></el-table-column>
              <el-table-column label="手机号" prop="phone"></el-table-column>
              <el-table-column label="注册时间" prop="date"></el-table-column>
              <el-table-column align="right">
                <template slot="header" slot-scope>
                  <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                  <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">Edit</el-button>
                  <el-button
                    size="mini"
                    type="danger"
                    @click="handleDelete(scope.$index, scope.row)"
                  >Delete</el-button>
                </template>
              </el-table-column>
            </el-table>
          </el-main>
        </el-tab-pane>
        <!-- <el-tab-pane label="配置管理">配置管理</el-tab-pane>
        <el-tab-pane label="角色管理">角色管理</el-tab-pane>
        <el-tab-pane label="定时任务补偿">定时任务补偿</el-tab-pane>-->
      </el-tabs>
    </el-header>
  </el-container>
</template>
<script>
export default {
      data() {
    return {
      tableData: [
        {
          avatar: "",
          date: "2016-05-02",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1518 弄"
        },
        {
          date: "2016-05-04",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1517 弄"
        },
        {
          date: "2016-05-01",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1519 弄"
        },
        {
          date: "2016-05-03",
          name: "王小虎",
          address: "上海市普陀区金沙江路 1516 弄"
        }
      ],
      search: ""
    };
  },
  methods: {
    handleEdit(index, row) {
      console.log(index, row);
    },
    handleDelete(index, row) {
      console.log(index, row);
    },
    goBack() {
        console.log('go back');
      }
  }
}
</script>
<style scoped>

</style>