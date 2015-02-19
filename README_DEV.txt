README (Development)
=================================

Installation (Max OSX):
=================================
1. activator installed in dir: /Users/khaledabbas/Documents/Development/Software/activator-1.2.10/
2. PATH added into /etc/paths

Run Application
=================================
1. Open terminal window
2. Go to application directory e.g. on Mac: cd /Users/khaledabbas/Documents/workspace/the-architect-matrix/
3. Run command: activator run
4. Open browser and go to link http://localhost:9000/matrix/

Development Status
=================================
1. Implementing adding new product
	1.1. Type some text into searchBox
	1.2. Press Enter
	1.3. Fires Ajax call for URL /products/new
2. Issues:
	1.1. Ajax call reloads page twice; calling Application.newProduct then Application.matrix
	1.2. Takeaways:
		1.2.1. Make sure it's not jQuery that is causing the page refresh
		1.2.2. Google Play Ajax tutorial and see how it's implemented
3. Persistence:
	1.1. Choice 1: Riak with Soilr text search over label contents in Product->Label bucket
	1.2. Choice 2: Neo4j:
		1.2.1. Find the selected label with LEAST linked products
		1.2.2. Get every product linked from that label that is also linked to all other selected labels
			1.2.2.1. Problem: Neo4j community edition doesn't support high availability
		1.2.3. Use Redis for caching: either use Redis subscribe to get changes, or Riak/Neo4j publish changes mechanism if existed