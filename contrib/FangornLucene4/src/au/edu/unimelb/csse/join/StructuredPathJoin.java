package au.edu.unimelb.csse.join;

import au.edu.unimelb.csse.Operator;

public class StructuredPathJoin extends AbstractJoin {

	public StructuredPathJoin(String[] labels, int[] parentPos,
			Operator[] operators, Class<? extends AbstractPairwiseJoin> cl) throws InstantiationException, IllegalAccessException {
		super(labels, parentPos, operators);
		cl.newInstance();
	}

}