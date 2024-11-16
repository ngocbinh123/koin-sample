# koin-sample
A sample Android application demonstrating dependency injection using Koin.
This project showcases:
- Dependency injection patterns with Koin
- Clean Architecture implementation
- Android best practices

## Expectation 
we expect that all instances of use case, repository, etc are initial automatically by koin. 

## Demonstration
### Runtime Behavior
1. Launch the application
2. The MainViewModel automatically triggers the GetCurrentTripUseCase
3. The UI updates reactively based on the application state
4. Observe automatic dependency injection in action
### Verification Steps
1. Build and run the debug variant
```bash
    ./gradlew assembleDebug
```
2. Verify release variant
 ```bash
   ./gradlew assembleRelease
```
3. Check Koin modules initialization in logcat

## Principles 
- Clean architecture 
- SOLID

## Android technique 
- databinding 

## Libraries  
- Koin