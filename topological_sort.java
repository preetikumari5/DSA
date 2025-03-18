import java.util.*;

class Main {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[numCourses];
        
        // Initialize adjacency list
        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<>());
        
        // Build graph & compute in-degree
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        
        // Add all courses with in-degree 0 to queue
        for (int i = 0; i < numCourses; i++)
            if (indegree[i] == 0)
                queue.add(i);
        
        // BFS (Topological Sorting)
        int index = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            result[index++] = course;
            
            for (int neighbor : adj.get(course)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0)
                    queue.add(neighbor);
            }
        }
        
        return (index == numCourses) ? result : new int[0]; // If cycle exists, return []
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of courses: ");
        int numCourses = scanner.nextInt();
        
        System.out.print("Enter number of prerequisites: ");
        int n = scanner.nextInt();
        int[][] prerequisites = new int[n][2];

        System.out.println("Enter prerequisite pairs (course, prerequisite):");
        for (int i = 0; i < n; i++) {
            prerequisites[i][0] = scanner.nextInt();
            prerequisites[i][1] = scanner.nextInt();
        }

        int[] result = findOrder(numCourses, prerequisites);

        System.out.println("Topological Order: " + Arrays.toString(result));
    }
}
