import java.util.*;

class TopologicalSort {
  // Graph coloring: 0->not visited...1->visited...2->visited & processed
  private boolean detectCycleUtil(List<List<Integer>> adj, int[] visited, int v) {
    if (visited[v] == 1)
      return true;
    if (visited[v] == 2)
      return false;

    visited[v] = 1; // Mark current as visited
    for (int i = 0; i < adj.get(v).size(); ++i)
      if (detectCycleUtil(adj, visited, adj.get(v).get(i)))
        return true;

    visited[v] = 2; // Mark current node as processed
    return false;
  }
 // Cycle detection
 private boolean detectCycle(List<List<Integer>> adj, int n) {
    int[] visited = new int[n];
    for (int i = 0; i < n; ++i)
      if (visited[i] == 0)
        if (detectCycleUtil(adj, visited, i))
          return true;
    return false;
  }

  // Topological sort
  private void dfs(List<List<Integer>> adj, int v, boolean[] visited, Stack<Integer> mystack) {
    visited[v] = true;
    for (int i = 0; i < adj.get(v).size(); ++i)
      if (!visited[adj.get(v).get(i)])
        dfs(adj, adj.get(v).get(i), visited, mystack);

    mystack.push(v);
  }
  public int[] findOrder(int numCourses, int[][] prerequisites) {
    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < numCourses; i++)
      adj.add(new ArrayList<>());
    
    for (int i = 0; i < prerequisites.length; ++i)
      adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
    
    int[] ans = new int[numCourses];
    if (detectCycle(adj, numCourses))
      return new int[0];
   
    Stack<Integer> mystack = new Stack<>();
    boolean[] visited = new boolean[numCourses];
    
    for (int i = 0; i < numCourses; ++i)
      if (!visited[i])
        dfs(adj, i, visited, mystack);
    int index = 0;
    while (!mystack.isEmpty()) {
      ans[index++] = mystack.pop();
    }
    return ans;
  }
  public static void main(String[] args) {
    TopologicalSort solution = new TopologicalSort();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of courses: ");
    int numCourses = scanner.nextInt();

    System.out.print("Enter the number of prerequisites: ");
    int n = scanner.nextInt();
    int[][] prerequisites = new int[n][2];

    System.out.println("Enter prerequisite pairs (course, prerequisite):");
    for (int i = 0; i < n; i++) {
      prerequisites[i][0] = scanner.nextInt();
      prerequisites[i][1] = scanner.nextInt();
    }

    int[] result = solution.findOrder(numCourses, prerequisites);
    System.out.println("Topological order of courses:");
    System.out.println(Arrays.toString(result));
  }
}



