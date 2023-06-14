package executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonPatternTest {

	/**
	 * スレッド実行クラス
	 * (静的ネストクラス)
	 */
	public static class RunnableTest implements Runnable {

		// スレッドID保持
		long threadId;

		// シングルトンインスタンス保持
//		SingletonPublicFinalField instance;
//		SingletonStaticFactoryMethod instance;
		SingletonEnumType instance;

		// 実行メソッド
		public void run() {

			threadId = Thread.currentThread().getId();

			// インスタンス取得(SingletonPublicFinalField)
//			instance = SingletonPublicFinalField.INSTANCE;

			// インスタンス取得(SingletonStaticFactoryMethod)
//			instance = SingletonStaticFactoryMethod.getInstance();

			// インスタンス取得(SingletonStaticFactoryMethod)
			instance = SingletonEnumType.INSTANCE;

			// スレッドIDとnumを出力する
			System.out.println("threadId:" + threadId + ":instance:" + instance);

			// numをインクリメントして出力
			// スレッド間でロックする(全てのインスタンス間でのジャイアントロック)
			// ※オブジェクトではなく、静的なクラスでのロック
			//   ⇒全てのオブジェクト(インスタンス間でのロック)
//			synchronized(RunnableTest.class) {
//				instance.incrementNum();
//				System.out.println("threadId:" + threadId + ":instanceNum:" + instance.getNum());
//			}
//			synchronized(RunnableTest.class) {
//				instance.incrementNum();
//				System.out.println("threadId:" + threadId + ":instanceNum:" + instance.getNum());
//			}

			// ※ロックを外した時の挙動も見てみましょう
			instance.incrementNum();
			System.out.println("threadId:" + threadId + ":instanceNum:" + instance.getNum());
			instance.incrementNum();
			System.out.println("threadId:" + threadId + ":instanceNum:" + instance.getNum());
		}
	}

	/**
	 * メインメソッド
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// スレッドプールにスレッドを3つ生成する
		// ※newFixedThreadPool プールされたスレッドを利用する
		// →アプリケーション全体でスレッドの数を管理できる
		ExecutorService exec = Executors.newFixedThreadPool(3);
		// ※newCachedThreadPool 必要に応じてスレッドを生成する
		//   予定時間(60秒間)使用されないスレッドは破棄
		//   予定時間以内であればスレッドを再利用
		// ExecutorService exec = Executors.newCachedThreadPool();

		for(int i = 0; i < 3; i++) {
			exec.submit(new RunnableTest());
		}
	}
}
