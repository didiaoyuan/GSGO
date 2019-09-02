 <template>
  <el-container class="login_bg">
    <el-header>Header</el-header>
    <el-row type="flex" justify="center">
      <el-col :span="6" justify="center">
        <el-main>
          <el-avatar shape="square" :size="100" :src="url"></el-avatar>
          <el-form
            :model="ruleForm"
            status-icon
            :rules="rules"
            ref="ruleForm"
            class="demo-ruleForm"
          >
            <div class="login_title">GSGO管理平台</div>
            <el-form-item label="类型" prop="role_id">
              <el-col span="20">
                <el-select v-model="ruleForm.role_id" placeholder="请选择" style="width:100%">
                  <el-option
                    v-for="item in options"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value"
                  ></el-option>
                </el-select>
              </el-col>
            </el-form-item>
            <el-form-item label="账户" prop="user_account">
              <el-col span="20">
                <el-input type="text" v-model="ruleForm.user_account"></el-input>
              </el-col>
            </el-form-item>
            <el-form-item label="密码" prop="user_pass">
              <el-col span="20">
                <el-input type="password" v-model="ruleForm.user_pass" autocomplete="off"></el-input>
              </el-col>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="submitForm('ruleForm')" size="medium">登录</el-button>
            </el-form-item>
            <el-link type="primary" @click="registerForm()">注册账号</el-link>
          </el-form>
        </el-main>
      </el-col>
    </el-row>
  </el-container>
</template>
<script>
import request from "@/utils/request.js";
export default {
  data() {
    return {
      options: [
        {
          value: "001",
          label: "管理员"
        },
        {
          value: "002",
          label: "普通会员"
        },
        {
          value: "003",
          label: "用户"
        }
      ],
      value: ""
      ,
      url:
        "https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg",
      ruleForm: {
        user_pass: "",
        user_account: ""
      },
      rules: {
        user_account: [{ required: true, message: "请输入账户名称", trigger: "blur" }],
        user_pass: [{ required: true, message: "请输入密码", trigger: "blur" }],
        role_id: [{ required: true, message: "选择登录类型", trigger: "change" }]
      }
    };
  },
  methods: {
    submitForm(formName) {
      // 前端验证输入的有效性
      this.$refs[formName].validate(valid => {
        if (valid) {
          alert("submit!");
          // 进行http通信登录并判断跳转
          request
            .post("/user/login", {
              user_account: this.ruleForm.user_account,
              user_pass: this.ruleForm.user_pass
            })
            .then(res => {
              console.log(res.data);
              if (res.data.code === "0000") {
                // 登录成功并跳转
                this.$router.push("/layout");
              } else {
                // 提示登录失败
              }
            });
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
    registerForm() {
      this.$router.push("/register");
    }
  }
};
</script>
<style lang="scss" scoped>
.login_title {
  margin: 15px auto;
}

el-button{
  background-color: white;
  width: 1000px;
}
.login_bg{
// background: linear-gradient(#ffffff 50%, rgba(255,255,255,0) 0) 0 0,
// radial-gradient(circle closest-side, #FFFFFF 53%, rgba(255,255,255,0) 0) 0 0,
// radial-gradient(circle closest-side, #FFFFFF 50%, rgba(255,255,255,0) 0) 55px 0 #48B;
// background-size: 110px 200px;
// background-repeat: repeat-x;
}
</style>