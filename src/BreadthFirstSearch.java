
import java.util.HashSet;

public class BreadthFirstSearch  extends ASearch
{
	// Define lists here ...
	HashSet<ASearchNode> closedList;
	HashSet<ASearchNode> openList;
	Queue<ASearchNode> openQueue ;

	@Override
	public String getSolverName() 
	{
		return "BFS";
	}

	@Override
	public ASearchNode createSearchRoot(IProblemState problemState)
	{
		ASearchNode newNode = new BlindSearchNode(problemState);
		return newNode;
	}
	
	@Override
	public void initLists() 
	{
		closedList = new HashSet<>();
		openList = new HashSet<>();
		openQueue = new Queue<>(3000000);
	}

	@Override
	public ASearchNode getOpen(ASearchNode node)
	{
		if(isOpen(node))
			return node ;

		return null;
	}

	@Override
	public boolean isOpen(ASearchNode node)
	{
		return openList.contains(node);
	}
	
	@Override
	public boolean isClosed(ASearchNode node)
	{
		return closedList.contains(node);
	}

	@Override
	public void addToOpen(ASearchNode node)
	{
		openList.add(node);
		openQueue.enqueue(node);
	}

	@Override
	public void addToClosed(ASearchNode node)
	{
		openList.remove(node);
 		closedList.add(node);
	}

	@Override
	public int openSize() 
	{
		return openList.size();
	}

	@Override
	public ASearchNode getBest() 
	{
		return openQueue.dequeue();
	}

	

}
