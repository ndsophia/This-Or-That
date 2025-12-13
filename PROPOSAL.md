## THIS OR THAT
Team Members: Zuri, Camille, Sophie
Category: Game Development

1. PROBLEM STATEMENT (2-3 sentences)
    
Decision fatigue affects teens and young adults who struggle to choose between multiple options, whether selecting classes, prioritizing tasks, or making daily choices. When faced with 5+ options simultaneously, users experience analysis paralysis that wastes time and increases stress, particularly when decisions need to be made quickly or repeatedly.

2. SOLUTION (3-4 sentences)
    
This or That is a Java based ranking application that eliminates decision fatigue through  comparisons. Users input all their options, then the program presents two choices at a time ("This or That?"), tracking preferences through our custom algorithm. After completing all pairwise comparisons, the system generates a definitive ranking from most to least preferred, removing the cognitive burden of comparing many items simultaneously.

3. TARGET MARKET (1-2 sentences)
    
Our primary users are high school and college students (ages 14-24) who make frequent daily decisions about scheduling, priorities, and choices. With approximately 50 million students in this demographic in the US alone, we estimate reaching 20-100 beta users initially, scaling to 10,000+ users within 12 months through campus adoption.

4. WHY IT'S VALUABLE (1-2 sentences)
    
The root of our product’s benefits is time optimization and stress relief, transforming a 10–15 minute decision process into a 2–3 minute guided experience that saves users hours weekly. By eliminating second-guessing with clear, actionable rankings, it reduces decision-related anxiety and helps users commit confidently, directly addressing the paralysis that prevents task completion.

5. HOW YOU'LL MAKE MONEY (1-2 sentences)

Initial launch: Free beta with user feedback collection
Post-MVP: Freemium model - free for up to 10 items per ranking, $2.99 one-time purchase for unlimited rankings and save/export features
Future revenue: $0.99/month premium subscription for advanced features (multi-user rankings, criteria weighting, analytics)

6. MVP FEATURES (Bulleted list)

* Binary comparison engine: Pairwise "This or That" prompts for all options
* Automatic ranking: Algorithm calculates final order based on user choices
* List customization: Users input unlimited custom options
* Session persistence: Save rankings to text file for future reference
* Quit/restart functionality: Exit gracefully at any point

7. TIMELINE & DIVISION OF WORK (REQUIRED - NOT OPTIONAL)

(Dec 9-12):
Zuri: Conduct competitive analysis of 5 similar apps, draft initial proposal sections, survey 20 target users about decision-making pain points
Camille: Complete RankingAlgorithm and RankingGame classes (already 80% complete), implement file save functionality for rankings
Sophie: Write JUnit tests for algorithm accuracy (minimum 10 test cases), implement Option class for future feature expansion, review code documentation

(Dec 12-14):
Zuri: Finalize proposal with market research findings and survey feedback
Camille: Debug edge cases (2 items, duplicate entries, special characters), optimize comparison algorithm
Sophie: Complete testing suite with 95%+ code coverage, add inline documentation to all methods, create user guide/README

(Dec 15-16 ):
All team members: User testing with 10-15 beta testers, bug fixes, final presentation preparation

8. TEAM ROLES & RESPONSIBILITIES (REQUIRED - NOT OPTIONAL)

Zuri – Product Owner + Business Analyst
- Writing proposal and market research documentation
- Prioritizing customer-valued features based on user feedback
- Analyzing monetization strategies and competitive landscape
- Managing user testing coordination
- Estimated % of codebase: 10% 

Sophie – Documentation Lead + Quality Assurance
- Implementing comprehensive JUnit test suite (edge cases, stress testing)
- Writing inline code documentation and user-facing README
- Researching best practices for CLI interface design
- Conducting code reviews for clarity and maintainability
- Estimated % of codebase: 35%

Camille – Lead Developer + Technical Architect
- Developing core ranking algorithm and game controller
- Implementing file I/O for saving/loading rankings
- Code review and debugging
- Optimizing algorithm efficiency 
- Estimated % of codebase: 55% 

9. VIABILITY: HOW WE'LL PROVE THIS WORKS (REQUIRED - NOT OPTIONAL)
10. 
How will you validate that real users want this?

 We ran a survey that was given out to around 20 people within our target audience's age range, with the majority of responses confirming that decision fatigue is a common issue amongst teenagers and young adults, and that a game that's purpose was to guide the user in making decisions would help with decision fatigue. Through research, it's proven that not only is pairwise comparison a common testing strategy, but is already a large part of young adult spaces such as fandom, where others create websites made to rank various things like characters through pairwise comparison. This or That stands out against these because it allows the user to create a custom ranking list and input any options compared to websites which are restricted to a specific set of options made by the creator, allowing ordinary people who don't have the knowledge to make their own ranking algorithm to have access to easy pairwise comparison. 

10. SCALABILITY: ROADMAP FROM MVP TO 100K USERS (REQUIRED - NOT OPTIONAL)

Phase 1 - MVP ((Now) 20-100 users):

Core features: Binary comparisons, automatic ranking, save to file
Platform: Command-line Java application
Distribution: Direct download via GitHub, share in student Discord servers and campus group chats

Phase 2 - Refined Product ((6 months))100-2,000 users):

Add: Simple GUI interface, ability to save/load multiple ranking sessions, export rankings as text files
Marketing: Word-of-mouth, post in college subreddits (like r/college, r/productivity), share in 2-3 student organizations
Monetization: Launch freemium model - free basic version, $4 for unlimited saved rankings


Phase 3 - Growth Phase ((6+ Months) 2,000-10,000 users):

Mobile consideration: Explore simple mobile app or mobile friendly web version if demand exists
Feature additions based on user requests:
Category labels for different types of lists (tasks, choices, priorities)
Share rankings with friends via link/screenshot
Basic statistics (most chosen options, time saved)

Long-term vision (12+ months, 10,000-100,000 users):
Full mobile app with cloud sync if financially viable
Collaborative features (groups can rank together)
API for integration with existing productivity tools
Focus remains on simplicity and speed - avoiding feature bloat

Expanded marketing: TikTok/Instagram posts demonstrating the app, student influencer partnerships
Revenue goal: $500-1,000 monthly through purchases
Potential: If growth exceeds projections, consider part-time contractor for mobile development

11. SOURCES & REFERENCES (REQUIRED - NOT OPTIONAL)
    List all sources for market claims, competitive analysis, and research
- Source 1: [https://www.userresearchstrategist.com/p/a-guide-to-pairwise-comparison]
    - Source 2: [https://www.researchgate.net/publication/266398023_Gamification_in_Theory_and_Action_A_Survey]
    - Interviews: [Ran a survey asking friends aged teenagers to young adults asking whether they had interest in the game and what they would pay.]


