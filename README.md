# Exercise to explore pathfinding algorithms in java programming language

### My plan: 
1. Get to draw a maze :chart_with_upwards_trend:
2. Get a working algorithm to solve the maze :space_invader:
3. At first it will be simple but my go to is the A* or Djikstra's algorithm
4. When I have my A* or Djikstra working, I would like to make it edcative so that it is possible to see the weights and calculations of eacht step and that sort of things.
5. Maybe go back and try to work out an algorithm to generate mazes on its own.

All of these things in a Java GUI environment that is very visual.

#### Comments on my progress: 

1. The first step was pretty simple, I just did a bi-dimensional array structure to store a bunch of integers which I gave a meaning e.g: 1 is wall, 0 is path, 2 is beggining and 3 is goal...I knew this structure would be the most simple but I also was concerned that there wasnt enough information on it in order to perform the next steps. But anyways I went ahead and drawed it by iterating through it and stablishing a color code.
2. 
	* DFS: (DEpth first search) This has been the hardest part so far. I went ahead and took a look at some simple algorithms (actually first I tried to do one simple thing to figure if it was working) and came across DFS and BFS, the pseudo code looked pretty short and the fundation of it, simple and logical, but I had a tough battle with data structures, having to implement an ArrayList of IntPairs, class that I did. It took some faith and brain work, but men, what a satisfaction when it actually worked :blush:
