# Print-by-bluetooth

Step 1. Add the JitPack repository to your build file

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency
  
  dependencies {
		implementation 'com.github.User:Repo:Tag'
	}
  
  
  That's it! The first time you request a project JitPack checks out the code, builds it and serves the build artifacts (jar, aar).
