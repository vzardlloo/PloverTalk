# PloverTalk
--一个在线聊天系统的demo
+ 支持管理员和普通用户两种模式登录，管理员可以踢出普通用户
+ 前后端交互，Js发起Http请求到后台servlet,servlet根据Http请求调用对应方法反馈给前端Js
+ 纯原生，用servlet利用反射构造一个根据method进行分发的自定义控制器，没使用任何框架
