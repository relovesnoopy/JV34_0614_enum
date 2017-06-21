package ac.jp.hal;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyClass mc = new MyClass();
		//System.out.println(mc.getNameById(MyClass.Gakubu.IH));

		//定義名称
		System.out.println(MyClass.Gakubu.IH.name());
		//定数
		System.out.println(MyClass.Gakubu.IH.ordinal());

		System.out.println(mc.getNameByEnum(MyClass.Gakubu.AT));

		//列挙型変数
		MyClass.Gakubu g;
		g = MyClass.Gakubu.IW;
		System.out.println(mc.getNameByEnum(g));

		MyClass.Gakubu[] ga;
		ga = new MyClass.Gakubu[5];
		//初期化
		for(int i = 0;i<ga.length;i++){
			ga[i] = MyClass.Gakubu.AT;
		}
		for(MyClass.Gakubu w : ga){
			System.out.println(w);
		}

		//２番目だけIH
		ga[2] = MyClass.Gakubu.IH;
		for(MyClass.Gakubu w : ga){
			System.out.println(w);
		}


	}

}
