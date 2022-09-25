class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        wordsCount = Counter(words)
        return sorted(wordsCount, key=lambda x: (-wordsCount[x], x))[:k]