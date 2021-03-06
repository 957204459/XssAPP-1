package com.xss.web.enm;

public enum CacheKeyEnum {
	SYS_SESSION_KEY,//http请求session前缀
	
	USER_INFO_KEY, // 用户信息KEY
	USER_LIST_KEY, // 用户信息KEY
	USER_INFO_ID_KEY, // 用户信息KEY
	SITE_SUFFIX_KEY, // 网站后缀列表KEY
	SITE_STA_SUFFIX_KEY, // 网站靜態后缀列表KEY
	SETTING_KEY, // 网站设置表
	SITE_DEF_SUFFIX_KEY, // 默认后缀KEY
	PROJECR_SORT_URI_KEY, // 项目短网址
	SITE_AVA_SUFFIX_KEY, // 可用後綴KEY
	SITE_TMP_SUFFIX_KEY, // 當前後綴
	USER_MODULE_LIST_KEY, // 用户模版列表
	USER_MODULE_INFO_KEY, // 用户模版信息
	USER_MODULE_REPLACE_KEY, // 用户模版信息
	USER_PROJECT_REPLACE_KEY, // 用户项目信息
	USER_PROJECT_LIST_KEY, // 用户项目列表
	USER_PROJECT_LETER_COUNT_KEY, // 用户项目内容数
	USER_PROJECT_INFO_KEY, // 用户项目列表
	SYS_MODULE_LIST_KEY, // 系统模版列表
	ALL_MODULE_LIST_KEY, // 模版列表
	LETTER_INFO_KEY, // 信封信息
	LETTER_CONTEXT_KEY, // 信封信息
	LETTER_PARAS_KEY, // 信封信息
	LETTER_LIST_KEY, // 信封列表信息
	EMAIL_INFO_KEY, // 邮箱信息
	USER_UUID_KEY, // 用户随机码KEY
	USER_VERCODE_KEY, // 用户验证码KEY
	ADMIN_INFO_KEY, // 管理员信息KEY
	ADMIN_LIST_KEY, // 管理员列表KEY
	USER_COUNT_KEY, // 用户数目KEY
	LETTER_COUNT_KEY, // 信封数目KEY
	PROJECT_COUNT_KEY, // 项目数目KEY
	PROJECT_PAGER_KEY, // 项目列表KEY
	MODULE_PAGER_KEY, // 模块列表KEY
	LETTER_PAGER_KEY, // 信封列表KEY
	MODULE_COUNT_KEY, // 模版数目KEY
	ROLE_LIST_KEY, // 角色列表KEY
	ROLE_INFO_KEY, // 角色KEY
	ROLE_MENU_LIST_KEY, // 角色菜单列表KEY
	MENU_INFO_KEY, // 菜单详情KEY
	MENU_LIST_KEY, // 菜单列表KEY
	ADMIN_MENU_LIST_KEY, // 管理员菜单列表KEY
	INVITE_INFO_KEY, // 邀请码信息KEY
	INVITE_LIST_KEY, // 邀请码列表信息KEY
	EMAIL_SEND_KEY,//发送邮件KEY
	;
}
