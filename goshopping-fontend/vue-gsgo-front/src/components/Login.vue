 <template>
  <el-container>
    <el-header>Header</el-header>
    <el-main>
      <el-row type="flex" justify="center">
        <el-col :span="6">
          <el-input placeholder="请输入账号" v-model="input" clearable></el-input>
          <el-input placeholder="请输入密码" v-model="pass" show-password></el-input>
          <el-button type="primary">登录</el-button>
        </el-col>
      </el-row>
    </el-main>
    <el-footer>Footer</el-footer>
  </el-container>
</template>
<script>
export default {
  data() {
    return {
      input: "",
      pass: ""
    };
  }
};
</script>
<style lang="scss" scoped>
* {
  //字体颜色
  color: white;
  // 背景图案
  background: linear-gradient(27deg, #151515 5px, transparent 5px) 0 5px,
    linear-gradient(207deg, #151515 5px, transparent 5px) 10px 0px,
    linear-gradient(27deg, #222 5px, transparent 5px) 0px 10px,
    linear-gradient(207deg, #222 5px, transparent 5px) 10px 5px,
    linear-gradient(90deg, #1b1b1b 10px, transparent 10px),
    linear-gradient(
      #1d1d1d 25%,
      #1a1a1a 25%,
      #1a1a1a 50%,
      transparent 50%,
      transparent 75%,
      #242424 75%,
      #242424
    );
  background-color: #131313;
  background-size: 20px 20px;
}
// 容器对齐方式
.el-header,
.el-footer {
  text-align: center;
  line-height: 60px;
}

.el-input{
  margin:15px;
}
</style>