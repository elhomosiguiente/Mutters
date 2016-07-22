package com.rabidgremlin.mutters;

public class NumberSlot implements Slot {

	private String name;
	
	
	
	public NumberSlot(String name) {
		super();
		this.name = name;
	}

	@Override
	public SlotMatch match(String token) {
		try
		{
			Integer value = Integer.parseInt(token);
			
			return new SlotMatch(this, token, value);
		}
		catch(NumberFormatException e)
		{
			return null;
		}
	}

	@Override
	public String getName() {
		return name;
	}

}
