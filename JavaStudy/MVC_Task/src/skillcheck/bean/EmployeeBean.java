package skillcheck.bean;

/**
 * ・社員情報データ（モデル）
 *
 * @author y.sato
 * @since 2019/01/02
 */
public final class EmployeeBean {

// FIXME Step-1-1: 以下に社員情報として不足しているフィールド変数、セッター、ゲッターを記述しなさい。
// Tips: 社員情報テーブルの内容を確認

	/** ・社員番号 */
	private String _empId;
	/** ・パスワード */
	private String _password = "1234";
	/** ・名前（追加） */
	private String _name;
	/** ・メールアドレス */
	private String _mail;
	/** ・得意言語 or 学習中の言語 */
	private String _programingLanguage;
	/** ・コメント（一言） */
	private String _comment;
	/** ・削除フラグ（0:未削除/1:削除） */
	private String _deleteFlg;

	/**
	 * コンストラクタ: パラメーターなし
	 */
	public EmployeeBean() {
	}

	/**
	 * コンストラクタ
	 *
	 * @param empId
	 */
	public EmployeeBean(String empId) {
		this._empId = empId;
	}

	/**
	 * コンストラクタ: パラメーターあり（削除フラグ以外）
	 *
	 * @param empId
	 *
	 *                           <pre>
	 *                           社員番号
	 *                           </pre>
	 *
	 * @param password
	 *
	 *                           <pre>
	 *                           パスワード
	 *                           </pre>
	 *
	 * @param name
	 *
	 *                           <pre>
	 *                           名前
	 *                           </pre>
	 *
	 * @param mail
	 *
	 *                           <pre>
	 *                           メールアドレス
	 *                           </pre>
	 *
	 * @param programingLanguage
	 *
	 *                           <pre>
	 *                           プログラミング言語
	 *                           </pre>
	 *
	 * @param comment
	 *
	 *                           <pre>
	 *                           コメント
	 *                           </pre>
	 */
	public EmployeeBean(String empId, String password, String name, String mail, String programingLanguage,
			String comment) {
		this._empId = empId;
		this._password = password;
		this._name = name;
		this._mail = mail;
		this._programingLanguage = programingLanguage;
		this._comment = comment;
	}

	/**
	 * コンストラクタ: パラメーターあり（全て）
	 *
	 * @param empId
	 *
	 *                           <pre>
	 *                           社員番号
	 *                           </pre>
	 *
	 * @param password
	 *
	 *                           <pre>
	 *                           パスワード
	 *                           </pre>
	 *
	 * @param name
	 *
	 *                           <pre>
	 *                           名前
	 *                           </pre>
	 *
	 * @param mail
	 *
	 *                           <pre>
	 *                           メールアドレス
	 *                           </pre>
	 *
	 * @param programingLanguage
	 *
	 *                           <pre>
	 *                           プログラミング言語
	 *                           </pre>
	 *
	 * @param comment
	 *
	 *                           <pre>
	 *                           コメント
	 *                           </pre>
	 *
	 * @param deleteFlg
	 *
	 *                           <pre>
	 *                           削除フラグ
	 *                           </pre>
	 */
	public EmployeeBean(String empId, String password, String name, String mail, String programingLanguage,
			String comment, String deleteFlg) {
		this._empId = empId;
		this._password = password;
		this._name = name;
		this._mail = mail;
		this._programingLanguage = programingLanguage;
		this._comment = comment;
		this._deleteFlg = deleteFlg;
	}

	public void setEmpId(String empId) {
		this._empId = empId;
	}

	public String getEmpId() {
		return _empId;
	}

	public void setPassword(String password) {
		this._password = password;
	}

	public String getPassword() {
		return _password;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getName() {
		return _name;
	}

	public void setMail(String mail) {
		this._mail = mail;
	}

	public String getMail() {
		return _mail;
	}

	public void setProgramingLanguage(String programingLanguage) {
		this._programingLanguage = programingLanguage;
	}

	public String getProgramingLanguage() {
		return _programingLanguage;
	}

	public void setComment(String comment) {
		this._comment = comment;
	}

	public String getComment() {
		return _comment;
	}

	public void setDeleteFlg(String deleteFlg) {
		this._deleteFlg = deleteFlg;
	}

	public String getDeleteFlg() {
		return _deleteFlg;
	}

}
