package com.wfuhui.modules.member.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wfuhui.modules.member.entity.MemberEntity;
import com.wfuhui.modules.sys.dao.BaseDao;


/**
 * 会员
 * 
 */
@Mapper
public interface MemberDao extends BaseDao<MemberEntity> {

	MemberEntity queryByOpenid(String openid);

	MemberEntity queryByLoginName(String loginName);
}
