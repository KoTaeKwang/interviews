package adapterPattern;

public class AdapterImpl implements Adapter { 
	@Override
	public Float twiceof(Float f) {
		return Math.doubled(f.doubleValue()).floatValue();
	}
	@Override
	public Float halfof(Float f) {
		System.out.println("���ݽ���");
		return (float)Math.half(f.doubleValue());
	}
}
