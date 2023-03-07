package tech.stl.patient.constant;

public enum ConstantEnum {
	BOOK_APPOINTMENTS("http://localhost:1001/appointment");

	public String value;

	ConstantEnum(String inputValue) {

		this.value = inputValue;

	}

	public String getValue() {
		return value;
	}

}


