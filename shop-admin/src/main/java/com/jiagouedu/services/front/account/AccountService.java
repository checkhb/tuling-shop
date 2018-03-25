package com.jiagouedu.services.front.account;import com.jiagouedu.core.Services;import com.jiagouedu.services.front.account.bean.Account;public interface AccountService extends Services<Account> {	/**	 * @param e	 * @return	 */	int selectCount(Account e);		/**	 * 注册一个外部账号，此方法是现成安全的	 * @param acc	 */	void insertOutAccount(Account acc);		/**	 * 找回密码，给指定账号发送找回密码的邮件	 * @param e	 */	void doForget(Account e);		/**	 * 给指定邮箱发送邮件	 * @param e	 */	void sendEmail(Account e, String emailNotifyTemplateCode);	/**	 * 修改密码	 * @param acc	 */	void updatePasswordByAccount(Account acc);	/**	 * 修改邮箱	 *///	public void updateEmail(Account e);	/**	 * 修改邮箱	 * @param acc	 */	void updateEmailByAccount(Account acc);	/**	 * 更新会员积分和会员等级，只会更新score和rank字段。	 * 如果会员等级发生了变动,则进行短信/站内信/邮件等方式的通知	 * 此方法是线程安全的	 *	 * 注意,此方法是系统中唯一更新会员积分和等级的通道入口.系统不再提供其他入口来做这个事情,包括原声的update方法也不负责此事。因为多个入口会导致积分数据混乱,同时也会影响到会员等级.	 * @param acc	 */	void updateScore(Account acc);	/**	 * 激活账号，同时使所有发出的链接都失效	 * @param acc	 */	void updateDataWhenActiveAccount(Account acc, String account);}