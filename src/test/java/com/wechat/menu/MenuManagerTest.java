package com.wechat.menu;

import java.util.List;

import net.sf.json.JSONObject;

import org.junit.Test;

import com.wechat.menu.manager.MenuManager;
import com.wechat.menu.pojo.Menu;


public class MenuManagerTest {

	/**
	 * ����menu���ɵĲ˵��Ƿ��������
	 */
	@Test
	public void testMenuJSON(){
		List<Menu> menus = MenuManager.getMenu();
		JSONObject jsonMenu = new JSONObject();
		jsonMenu.put("button", menus);
		System.out.println(jsonMenu.toString());
	}
	
}
