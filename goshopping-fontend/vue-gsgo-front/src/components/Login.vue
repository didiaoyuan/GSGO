 <template>
  <el-container>
    <el-header>Header</el-header>
    <el-row type="flex" justify="center">
      <el-col :span="6" justify="center">
        <el-main>
          <el-image style="width: 100px; height: 100px" :src="url"></el-image>
          <el-form
            :model="ruleForm"
            status-icon
            :rules="rules"
            ref="ruleForm"
            class="demo-ruleForm"
          >
            <el-form-item label="类别" prop="user_account">
              <el-select v-model="value" placeholder="请选择">
                <el-option
                  v-for="item in options"
                  :key="item.value"
                  :label="item.label"
                  :value="item.value"
                ></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="账户" prop="user_account">
              <el-input type="text" v-model="ruleForm.user_account"></el-input>
            </el-form-item>
            <el-form-item label="密码" prop="user_pass">
              <el-input type="password" v-model="ruleForm.user_pass" autocomplete="off"></el-input>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="submitForm('ruleForm')">登录</el-button>
            </el-form-item>
          </el-form>
        </el-main>
      </el-col>
    </el-row>
  </el-container>
</template>
<script>
export default {
  data() {
    return {
      options: [
        {
          value: "选项1",
          label: "管理员"
        },
        {
          value: "选项2",
          label: "普通会员"
        },
        {
          value: "选项3",
          label: "用户"
        }
      ],
      value: "",
      url:
        "https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg",
      ruleForm: {
        user_pass: "",
        user_account: ""
      },
      rules: {
        // pass: [{ validator: validatePass, trigger: "blur" }],
        // checkPass: [{ validator: validatePass2, trigger: "blur" }]
      }
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
          alert("submit!");
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>