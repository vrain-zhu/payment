package com.vrain.utils;

public class PaymantUtil {
	private PaymantUtil() {
	}

	/**
	 * 生成hmac的方法
	 * @param p0_Cmd 业务类型
	 * @param p1_Merld 商户编号
	 * @param p2_Order 商户订单编号
 	 * @param p3_Amt 支付现金
	 * @param p4_Cur 交易币种
 	 * @param p5_Pid 商品名称
	 * @param p6_Pcat 商品种类
	 * @param p7_Pdesc 商品描述
	 * @param p8_Url 商户交易接受支付成功数据的链接
	 * @param p9_SAF 发货地址
	 * @param pa_MP 商户拓展信息
	 * @param pd_Frpld 银行编号
	 * @param pr_NeedResponse 应答机制。0/1
	 * @param keyValue 商户密钥
	 * @return
	 */
	public static String buildHmac(String p0_Cmd, String p1_Merld, String p2_Order, String p3_Amt, String p4_Cur,
			String p5_Pid, String p6_Pcat, String p7_Pdesc, String p8_Url, String p9_SAF, String pa_MP, String pd_Frpld,
			String pr_NeedResponse, String keyValue) {
		StringBuffer sValue = new StringBuffer();
		sValue.append(p0_Cmd);//业务类型
		sValue.append(p1_Merld);//商户编号
		sValue.append(p2_Order);//商户订单编号
		sValue.append(p3_Amt);//支付现金
		sValue.append(p4_Cur);//交易币种
		sValue.append(p5_Pid);//商品名称
		sValue.append(p6_Pcat);//商品种类
		sValue.append(p7_Pdesc);//商品描述
		sValue.append(p8_Url);//商户接受支付成功数据的链接
		sValue.append(p9_SAF);//发货地址
		sValue.append(pa_MP);//商户拓展信息
		sValue.append(pd_Frpld);//银行编号
		sValue.append(pr_NeedResponse);//应答机制。0/1
		String sNewString = DigestUtil.hmacSign(sValue.toString(),keyValue);
		return sNewString;
	}
}
