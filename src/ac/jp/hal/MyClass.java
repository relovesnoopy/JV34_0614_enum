package ac.jp.hal;

public class MyClass {

	//列挙型の定義はenum
			public enum Gakubu{
				AT,
				IH,
				IW
			}

	public String getNameByEnum(Gakubu id){
		String result = "";

		/*if(id == Gakubu.AT){

		}*/

		switch(id){
			case AT:
				result = "ATの処理";
				break;
			case IH:
				result = "IHの処理";
				break;
			case IW:
				result = "IWの処理";
				break;
		}
		return result;
	}
}
