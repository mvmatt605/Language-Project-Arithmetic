public class ExpNode extends Node {

	private Node left:
	private Node right;
	private OpNode op;

	public ExpNode(Node left, Opnode, Node right){
		this.left = left;
		this.op = op;
		this.right = right;
	}

	@Override
	public String getName(){
		return op.getName();
	}

	@Override
	public int eval(){
		int leftVal = left.eval();
		int rightVal = right.eval();
		String Operator = op.getName();

		if(operator.equals("+")){
			return leftVal + rightVal;
		}
	
		if(operator.equals("-")){
			return leftVal - rightVal;
		}

		if(operator.equals("*")){
			return leftVal * rightVal;
		}

		if(operator.equals("/")){
			 return leftVal / rightVal;
		}
	}
}
