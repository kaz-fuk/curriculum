package exception;

import java.util.Scanner;

/**
 * 4-1 : 課題内容
 *
 * よく目にする例外処理に関して、課題をこなしていただきます。 問①〜③の指示に従い必要な処理を記述してください。
 *
 * 実行時はScannerを利用して処理の確認を行います。 コンソールへ必要なパラメーター入力し、Enterを押下して実装結果を確認していきましょう！
 *
 */
public class ExException {

	// 定数（条件）
	private static final int CONST_EXCEPTION_TRIGER_NULL = 1;
	private static final int CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS = 2;
	private static final int CONST_EXCEPTION_TRIGER_CAST = 3;

	// 定数（クラスキャストの例外用）
	private static final Object CONST_OBJ_FOR_CLASS_CAST = 100;

	// 定数（メッセージ）
	private static final String CONST_COMMON_INIT_INFO = "\n■3-3-4:ExException 入力値「1: 続行」／「-1: 終了」";
	private static final String CONST_COMMON_TASK_INPUT_NAME = "以下の例外を発生させるためのパラメーター（1〜3）のいずれかを入力してください。\n・1: NullPointerException\n・2: ArrayIndexOutOfBoundsException\n・3: ClassCastException";
	private static final String CONST_COMMON_MSG_ERROR_EXCEPTION = "エラー: 入力値が不正です。";
	private static final String CONST_MSG_NOT_EXCEPTION_TRIGGER = "例外の発生しないパラメーターです。";
	private static final String CONST_MSG_NULLPO = "ヌルポです。";

	public static void main(String[] args) {

		int parameter;
		int retryCounter = 0;
		Scanner sc;

		do {
			System.out.println(CONST_COMMON_INIT_INFO);
			sc = new Scanner(System.in);

			try {
				final int execute = sc.nextInt();

				if (execute == -1)
					break;

				if (execute != 1) {
					System.out.println(CONST_COMMON_MSG_ERROR_EXCEPTION);
					continue;
				}

				System.out.println(CONST_COMMON_TASK_INPUT_NAME);
				parameter = sc.nextInt();

				switch (parameter) {
				case CONST_EXCEPTION_TRIGER_NULL:
					StringLength(null);
					break;

				case CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS:
					int[] nums = new int[3];
					nums[5] = 999;
					break;

				case CONST_EXCEPTION_TRIGER_CAST:
					String castedStrValue = (String) CONST_OBJ_FOR_CLASS_CAST;
					System.out.println(castedStrValue);
					break;

				default:
					System.out.println(CONST_MSG_NOT_EXCEPTION_TRIGGER);
					break;
				}

			} catch (NullPointerException e) {
				printException(e);
			} catch (ArrayIndexOutOfBoundsException e) {
				printException(e);
			} catch (Exception e) {
				printException(e);
			} finally {
				System.out.println("リトライ回数 = " + retryCounter++);
			}
		} while (true);

		sc.close();
		System.out.println("お疲れ様でした！");
	}

	private static void StringLength(String str) throws Exception {
		if (str == null) {
			throw new NullPointerException(CONST_MSG_NULLPO);
		}
		int strlen = str.length();
		System.out.println(str + "は" + strlen + "文字です");
	}

	private static void printException(final Exception e) {
		System.out.println(e);
	}
}