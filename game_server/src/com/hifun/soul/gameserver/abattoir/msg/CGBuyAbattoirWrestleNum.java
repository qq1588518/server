package com.hifun.soul.gameserver.abattoir.msg;

import org.springframework.stereotype.Component;

import com.hifun.soul.core.msg.MessageType;
import com.hifun.soul.gameserver.common.msg.CGMessage;

/**
 * 请求购买角斗次数
 * 
 * @author SevenSoul
 */
@Component
public class CGBuyAbattoirWrestleNum extends CGMessage{
	
	
	public CGBuyAbattoirWrestleNum (){
	}
	
	
	@Override
	protected boolean readImpl() {
		return true;
	}
	
	@Override
	protected boolean writeImpl() {
		return true;
	}
	
	@Override
	public short getType() {
		return MessageType.CG_BUY_ABATTOIR_WRESTLE_NUM;
	}
	
	@Override
	public String getTypeName() {
		return "CG_BUY_ABATTOIR_WRESTLE_NUM";
	}

	@Override
	public void execute() {
	}
}