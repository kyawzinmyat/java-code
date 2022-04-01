 class TelslaFactory implements CarFactory{
	@Override
	public Car manufacture(){
			return new TelslaCar();
		}
}