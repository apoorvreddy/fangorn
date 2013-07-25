package au.edu.unimelb.csse.join;

import java.io.IOException;

import org.apache.lucene.index.DocsAndPositionsEnum;

import au.edu.unimelb.csse.Operator;

public interface HalfPairLATEJoin extends HalfPairJoin {
	
	NodePositions matchWithLookahead(NodePositions prev, Operator op,
			DocsAndPositionsEnum node, Operator nextOp) throws IOException;

	NodePositions matchTerminateEarly(NodePositions prev, Operator op,
			DocsAndPositionsEnum node) throws IOException;
	
	NodePositions matchWithLookahead(NodePositions prevPositions, Operator op,
			NodePositions metaPrev, Operator nextOp);

	NodePositions matchTerminateEarly(NodePositions prev, Operator op,
			NodePositions next);
	
	enum PruneOperation {
		PRUNE, PRUNE_STOP, JOIN_MATCH_REPLACE, JOIN_MATCH_ADD, JOIN_MATCH_ADD_STOP, JOIN_MATCH_REPLACE_MANY
	};
}