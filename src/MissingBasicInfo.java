public class MissingBasicInfo extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public MissingBasicInfo(String errorMessage, Throwable causeErr)  {
		super(errorMessage, causeErr);
	}
	
	public MissingBasicInfo(String errorMessage)  {
		super(errorMessage);
	}
	
	public MissingBasicInfo()  {
		super();
	}
}
