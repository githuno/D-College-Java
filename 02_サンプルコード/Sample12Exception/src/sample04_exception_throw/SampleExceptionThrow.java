package sample04_exception_throw;

import java.io.IOException;

public class SampleExceptionThrow {

	// 1階層目
	public static void main(String[] args) {
		try {
			System.out.println("main 開始");

			// method1 の呼び出し
			method1();

		} catch (Exception e) {
			System.out.println("main で例外発生");
			e.printStackTrace();

			// 上で書いているcatchで処理されるので以下は意味が無い
			// } catch (IOException e) {
			// System.out.println("main で例外発生");

		} finally {
			System.out.println("main 終了");
		}
	}

	// 2階層目
	public static void method1() throws IOException, SampleException {
		try {
			System.out.println("    method1 開始");

			// method21 の呼び出し
			method21();

			// method22 の呼び出し
			method22();

		} catch (IOException | SampleException e) {
			System.out.println("    method1 で例外発生");
			throw e;

		} finally {
			System.out.println("    method1 終了");
		}
	}

	// 3階層目(必ず例外発生する)
	public static void method21() throws IOException, SampleException {
		try {
			System.out.println("        method21 開始");

			// ここで例外を発生させてみる
			throw new IOException();
			// throw new SampleException();

		} catch (IOException e) {
			System.out.println("        method21 で例外発生");
			throw e;

		//} catch (SampleException se) {
		//	System.out.println("        method21 で例外発生");
		//	throw se;

		} finally {
			System.out.println("        method21 終了");
		}
	}

	// 3階層目(例外発生しない)
	public static void method22() {
		System.out.println("        method22 開始");
		System.out.println("        method22 終了");
	}
}
