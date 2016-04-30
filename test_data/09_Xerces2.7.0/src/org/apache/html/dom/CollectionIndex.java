package org.apache.html.dom;

/**
 * {@link CollectionImpl#item} must traverse down the tree and decrement the
 * index until it matches an element who's index is zero. Since integers are
 * passed by value, this class servers to pass the index into each recursion
 * by reference. It encompasses all the operations that need be performed on
 * the index, although direct access is possible.
 * 
 * @xerces.internal
 * 
 * @see CollectionImpl#item
 */
class CollectionIndex
{
    
    
    /**
     * Returns the current index.
     * 
     * @return Current index
     */
    int getIndex()
    {
        return _index;
    }
    
    
    /**
     * Decrements the index by one.
     */
    void decrement()
    {
        -- _index;
    }
    
    
    /**
     * Returns true if index is zero (or negative).
     * 
     * @return True if index is zero
     */
    boolean isZero()
    {
        return _index <= 0;
    }
    
    
    /**
     * Constructs a new index with the specified initial value. The index will
     * then be decremeneted until it reaches zero.
     * 
     * @param index The initial value
     */
    CollectionIndex( int index )
    {
        _index = index;
    }
    
    
    /**
     * Holds the actual value that is passed by reference using this class.
     */
    private int        _index;
    

}